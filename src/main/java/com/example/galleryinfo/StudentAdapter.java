package com.example.galleryinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

//intialize the recyclear view
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

//    class from mainactivity so that we can add text and image
    private List<MainActivity.Student> students;
    private boolean isListLayout;

    public StudentAdapter(List<MainActivity.Student> students, boolean isListLayout) {
        this.students = students;
        this.isListLayout = isListLayout;
    }

//    conditinal statement to check if user click on list or grid view and by default it set in list
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (isListLayout) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item_list, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item_grid, parent, false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainActivity.Student student = students.get(position);
        holder.nameTextView.setText(student.getName());
        holder.profileImageView.setImageResource(student.getProfileImage());
    }

//    array count
    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImageView;
        TextView nameTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImageView = itemView.findViewById(R.id.profile_picture_image_view);
            nameTextView = itemView.findViewById(R.id.name_text_view);
        }
    }
}
