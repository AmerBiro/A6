package com.example.a6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    Context context;
    List<MyEvent> myEventList;

    public EventAdapter(Context context, List<MyEvent> myEventList) {
        this.context = context;
        this.myEventList = myEventList;
    }

    @NonNull
    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_item,parent,false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.EventViewHolder holder, int position) {
        MyEvent myEvent = myEventList.get(position);
        holder.eventName.setText(myEvent.getEvent_name());
        holder.evenIcon.setImageResource(myEvent.getEvent_icon());
    }

    @Override
    public int getItemCount() {
        return myEventList.size();
    }


    public class EventViewHolder extends RecyclerView.ViewHolder{
        ImageView evenIcon;
        TextView eventName;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            evenIcon= itemView.findViewById(R.id.event_image);
            eventName=itemView.findViewById(R.id.event_name);
        }
    }
}
