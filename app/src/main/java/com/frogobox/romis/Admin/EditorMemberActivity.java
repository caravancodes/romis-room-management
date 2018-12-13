package com.frogobox.romis.Admin;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.frogobox.romis.R;

public class EditorMemberActivity extends AppCompatActivity {

    private ImageButton img_btn;
    private Button btn;

    public static final int PICK_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_member);

        btn = (Button) findViewById(R.id.Button_add);
        img_btn = (ImageButton) findViewById(R.id.ImageBtn);

        img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(EditorMemberActivity.this, AdminActivity.class);
                startActivity(i);
            }
        });




    }
}
