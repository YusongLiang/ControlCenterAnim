package com.gome.controlcenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView iconsView = findViewById(R.id.rv_ctrl_center_icons);
        iconsView.setLayoutManager(new GridLayoutManager(this, 4));
        iconsView.setAdapter(new IconsAdapter());
    }

    private static class IconsAdapter extends RecyclerView.Adapter<IconsAdapter.ViewHolder> {

        private static final int[] BUTTON_DRAWABLE_IDS = {
                R.drawable.btn_drawable_ctrl_center_bluetooth,
                R.drawable.btn_drawable_ctrl_center_data,
                R.drawable.btn_drawable_ctrl_center_dont_disturb,
                R.drawable.btn_drawable_ctrl_center_eye_comfort,
                R.drawable.btn_drawable_ctrl_center_flashlight,
                R.drawable.btn_drawable_ctrl_center_flightmode,
                R.drawable.btn_drawable_ctrl_center_game,
                R.drawable.btn_drawable_ctrl_center_hotspot,
                R.drawable.btn_drawable_ctrl_center_location,
                R.drawable.btn_drawable_ctrl_center_my_pocket,
                R.drawable.btn_drawable_ctrl_center_nfc,
                R.drawable.btn_drawable_ctrl_center_no_disturb,
                R.drawable.btn_drawable_ctrl_center_projection,
                R.drawable.btn_drawable_ctrl_center_rotate,
                R.drawable.btn_drawable_ctrl_center_screencap,
                R.drawable.btn_drawable_ctrl_center_screenshot,
                R.drawable.btn_drawable_ctrl_center_sound,
                R.drawable.btn_drawable_ctrl_center_secretmode,
                R.drawable.btn_drawable_ctrl_center_wifi
        };

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ctrl_center, parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final int index = holder.getAdapterPosition();
            holder.cbIcons.setButtonDrawable(BUTTON_DRAWABLE_IDS[index]);
        }

        @Override
        public int getItemCount() {
            return BUTTON_DRAWABLE_IDS.length;
        }

        private static class ViewHolder extends RecyclerView.ViewHolder {

            final CheckBox cbIcons;

            ViewHolder(@NonNull View itemView) {
                super(itemView);
                cbIcons = itemView.findViewById(R.id.cb_icon);
            }
        }

    }
}
