package com.project.kcci.habitsplanproject.database;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.project.kcci.habitsplanproject.vo.CategoryVO;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class CloudFirestore {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ArrayList<CategoryVO> categoryList;

    /***
     * 습관리스트 추가 (이름 바꿔야함)
     */
    public void habitListInsert() {


    }

    /***
     *  카테고리 전부 검색하기.
     * @return categoryList
     */
    public ArrayList<CategoryVO> CategoryAllSelect() {
        categoryList = new ArrayList();

        db.collection("Category").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        CategoryVO categoryVO = new CategoryVO();
                        categoryVO.setCategory(document.getString("Category"));
                        categoryList.add(categoryVO);
                    }
                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }
            }
        });

        return categoryList;
    }

}
