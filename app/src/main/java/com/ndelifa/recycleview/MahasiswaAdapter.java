package com.ndelifa.recycleview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

    public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {
        private List<Mahasiswa> mahasiswaList;
        private Context context;

        public MahasiswaAdapter(Context context, List<Mahasiswa> mahasiswaList) {
            this.context = context;
            this.mahasiswaList = mahasiswaList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Mahasiswa mahasiswa = mahasiswaList.get(position);
            holder.textViewName.setText(mahasiswa.getNama());
            holder.textViewNim.setText(mahasiswa.getNim());
            holder.imageView.setImageResource(mahasiswa.getGambarResource());
        }

        @Override
        public int getItemCount() {
            return mahasiswaList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView textViewName;
            TextView textViewNim;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.gambar);
                textViewName = itemView.findViewById(R.id.nama);
                textViewNim = itemView.findViewById(R.id.nim);
            }
        }
    }