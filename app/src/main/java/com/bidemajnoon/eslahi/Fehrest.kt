package com.bidemajnoon.eslahi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.bidemajnoon.eslahi.fehrest.chakoshi.Chakoshi
import com.bidemajnoon.eslahi.fehrest.changali.Changali
import com.bidemajnoon.eslahi.fehrest.garddanekaj.GardaneKaj
import com.bidemajnoon.eslahi.fehrest.kafegod.KafeGod
import com.bidemajnoon.eslahi.fehrest.kafesaf.KafeSaf
import com.bidemajnoon.eslahi.fehrest.lagan.Lagan
import com.bidemajnoon.eslahi.fehrest.payeparantezi.PayeParantezi
import com.bidemajnoon.eslahi.fehrest.payex.PayeX
import com.bidemajnoon.eslahi.fehrest.poshtegerd.PoshteGerd
import com.bidemajnoon.eslahi.fehrest.poshtegod.PoshteGod
import com.bidemajnoon.eslahi.fehrest.poshtekaj.PoshteKaj
import com.bidemajnoon.eslahi.fehrest.sarbejelo.SarBeJelo
import com.bidemajnoon.eslahi.fehrest.shane.Shane
import com.bidemajnoon.eslahi.fehrest.shast.Shast

class Fehrest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fehrest)

        lateinit var  poshte_gerd_btn : CardView
        lateinit var poshte_god_btn  : CardView
        lateinit var  paye_x_btn : CardView
        lateinit var paye_parantezi_btn  : CardView
        lateinit var  poshte_kaj_btn : CardView
        lateinit var  sar_be_jelo_btn : CardView
        lateinit var  gardane_kaj_btn : CardView
        lateinit var  lagan_btn : CardView
        lateinit var  shane_btn : CardView
        lateinit var  shast_btn : CardView
        lateinit var  kafe_god_btn : CardView
        lateinit var  kafe_saf_btn : CardView
        lateinit var  chakoshi_btn : CardView
        lateinit var  changali_btn : CardView

        poshte_gerd_btn = findViewById(R.id.poshte_gerd_btn)
        poshte_god_btn = findViewById(R.id.poshte_god_btn)
        paye_x_btn = findViewById(R.id.paye_x_btn)
        paye_parantezi_btn = findViewById(R.id.paye_parantezi_btn)
        poshte_kaj_btn = findViewById(R.id.poshte_kaj_btn)
        sar_be_jelo_btn = findViewById(R.id.sar_be_jelo_btn)
        gardane_kaj_btn = findViewById(R.id.gardane_kaj_btn)
        lagan_btn = findViewById(R.id.lagan_btn)
        shane_btn = findViewById(R.id.shane_btn)
        shast_btn = findViewById(R.id.shast_btn)
        kafe_god_btn = findViewById(R.id.kafe_god_btn)
        kafe_saf_btn = findViewById(R.id.kafe_saf_btn)
        chakoshi_btn = findViewById(R.id.chakoshi_btn)
        changali_btn = findViewById(R.id.changali_btn)

        poshte_gerd_btn.setOnClickListener{ startActivity(Intent(this , PoshteGerd::class.java)) }
        poshte_god_btn.setOnClickListener{ startActivity(Intent(this , PoshteGod::class.java)) }
        paye_x_btn.setOnClickListener{ startActivity(Intent(this , PayeX::class.java)) }
        paye_parantezi_btn.setOnClickListener{ startActivity(Intent(this , PayeParantezi::class.java)) }
        poshte_kaj_btn.setOnClickListener{ startActivity(Intent(this , PoshteKaj::class.java)) }
        sar_be_jelo_btn.setOnClickListener{ startActivity(Intent(this , SarBeJelo::class.java))}
        gardane_kaj_btn.setOnClickListener{ startActivity(Intent(this , GardaneKaj::class.java)) }
        lagan_btn.setOnClickListener{ startActivity(Intent(this , Lagan::class.java)) }
        shane_btn.setOnClickListener{ startActivity(Intent(this , Shane::class.java)) }
        shast_btn.setOnClickListener{ startActivity(Intent(this , Shast::class.java)) }
        kafe_god_btn.setOnClickListener{ startActivity(Intent(this , KafeGod::class.java)) }
        kafe_saf_btn.setOnClickListener{ startActivity(Intent(this , KafeSaf::class.java)) }
        chakoshi_btn.setOnClickListener{ startActivity(Intent(this , Chakoshi::class.java)) }
        changali_btn.setOnClickListener{ startActivity(Intent(this , Changali::class.java)) }

    }
}