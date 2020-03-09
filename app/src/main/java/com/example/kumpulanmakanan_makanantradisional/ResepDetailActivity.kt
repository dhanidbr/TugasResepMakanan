package com.example.kumpulanmakanan_makanantradisional

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resep_detail.*

class ResepDetailActivity : AppCompatActivity (){

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var email = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)
            tv_item_id.text = partId
            tv_name.text = nama
            tv_email.text = email

        }
    }

}