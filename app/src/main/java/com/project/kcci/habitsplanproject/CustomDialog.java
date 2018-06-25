package com.project.kcci.habitsplanproject;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.project.kcci.habitsplanproject.adapter.CustomSpinnerAdapter;
import com.project.kcci.habitsplanproject.database.CloudFirestore;

public class CustomDialog {
    private AlertDialog.Builder builder;
    private AlertDialog alertDialog;

    public void habitListAddDialog(final Context context, int layout){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(layout, null);

        Spinner category = view.findViewById(R.id.dialog_category_spinner);
        EditText title = view.findViewById(R.id.dialog_title_edit_text);
        CheckBox shareCheck = view.findViewById(R.id.dialog_share_check);

        Button btnCancel = view.findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        Button btnCreate = view.findViewById(R.id.btn_create);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        category.setAdapter(new CustomSpinnerAdapter(new CloudFirestore().CategoryAllSelect(), context));

        builder = new AlertDialog.Builder(context);
        builder.setView(view);

        alertDialog = builder.create();
        alertDialog.show();
    }


}
