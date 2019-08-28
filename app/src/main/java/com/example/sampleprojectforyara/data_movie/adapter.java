package com.example.sampleprojectforyara.data_movie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleprojectforyara.R;
import com.example.sampleprojectforyara.model.RetrofitGetResponse;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.myViewHolder> {

    Context context;
        List<RetrofitGetResponse> responseList;

        public adapter(Context context, List<RetrofitGetResponse> data) {
            this.context = context;
            this.responseList = data;
        }

        public void setEmployeeList(List<RetrofitGetResponse> resList) {
            this.responseList = resList;
            notifyDataSetChanged();
        }

        @Override
        public adapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.showmovie_main, parent, false);
            return new myViewHolder(view);
        }

        @Override
        public void onBindViewHolder(adapter.myViewHolder holder, int position) {
            holder.title.setText(responseList.get(position).getTitle());
            holder.imdbid.setText(responseList.get(position).getImdbID());
            holder.age.setText(responseList.get(position).getYear());
            holder.type.setText(responseList.get(position).getType());
            holder.poster.setText(responseList.get(position).getPoster());
        }

        @Override
        public int getItemCount() {
            if(responseList != null){
                return responseList.size();
            }
            return 0;

        }

        public class myViewHolder extends RecyclerView.ViewHolder {
            TextView title;
            TextView imdbid;
            TextView age;
TextView type;
TextView poster;
            public myViewHolder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.Title);
                type = (TextView) itemView.findViewById(R.id.type);
                age = (TextView) itemView.findViewById(R.id.Age);
                imdbid=itemView.findViewById(R.id.imdb);
                poster=itemView.findViewById(R.id.address);
            }
        }
}
