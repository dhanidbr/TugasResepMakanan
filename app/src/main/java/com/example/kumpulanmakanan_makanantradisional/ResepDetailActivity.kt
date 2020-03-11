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
            var nama= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var daerah = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var isiresep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)
            var fotoresep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER).toInt()
            tv_nama2.text = nama
            tv_daerah2.text = daerah
            tv_isiresep.text = isiresep
            tv_foto2.setImageResource(fotoresep)

        }
    }

}