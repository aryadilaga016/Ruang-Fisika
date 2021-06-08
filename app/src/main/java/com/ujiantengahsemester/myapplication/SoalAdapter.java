package com.ujiantengahsemester.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SoalAdapter extends RecyclerView.Adapter<SoalAdapter.ViewHolder>{
    Context context;
    List<Soal> soal_list;
    RadioGroup lastCheckedRadioGroup = null;

    public SoalAdapter (Context context, List<Soal> soal_list){
        this.context = context;
        this.soal_list = soal_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.soal4,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Soal model = soal_list.get(position);
        holder.no.setText(String.valueOf(model.getId_pertanyaan()));
        holder.pertanyaan.setText(model.getPertanyaan());
//        holder.pilihanGroup_.
//        holder.pilihana_.setText(model.getPilihan_a());
//        holder.pilihanb_.setText(model.getPilihan_b());
//        holder.pilihanc_.setText(model.getPilihan_c());
//        holder.pilihand_.setText(model.getPilihan_d());

    }

    @Override
    public int getItemCount() {
        return soal_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView no, pertanyaan;
        RadioGroup pilihanGroup_;
        public ViewHolder(View itemView) {
            super(itemView);

            no = itemView.findViewById(R.id.no);
            pertanyaan = itemView.findViewById(R.id.pertanyaan);
//            pilihana_ = (RadioButton) itemView.findViewById(R.id.pilihana_);
//            pilihanb_ = (RadioButton) itemView.findViewById(R.id.pilihanb_);
//            pilihanc_ = (RadioButton) itemView.findViewById(R.id.pilihanc_);
//            pilihand_ = (RadioButton) itemView.findViewById(R.id.pilihand_);

            pilihanGroup_.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    //since only one package is allowed to be selected
                    //this logic clears previous selection
                    //it checks state of last radiogroup and
                    // clears it if it meets conditions
                    if (lastCheckedRadioGroup != null
                            && lastCheckedRadioGroup.getCheckedRadioButtonId()
                            != radioGroup.getCheckedRadioButtonId()
                            && lastCheckedRadioGroup.getCheckedRadioButtonId() != -1) {
                        lastCheckedRadioGroup.clearCheck();

                        Toast.makeText(SoalAdapter.this.context,
                                "Radio button clicked " + radioGroup.getCheckedRadioButtonId(),
                                Toast.LENGTH_SHORT).show();

                    }
                    lastCheckedRadioGroup = radioGroup;

                }
            });
        }


        }
    }

