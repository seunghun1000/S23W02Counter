package kr.ac.kumoh.ce.s20100976.s23w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.ce.s20100976.s23w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
      //  setContentView(R.layout.activity_main)

        main.btnAdd.setOnClickListener{
            main.txtCount.text = "${++count}"
        }
        main.btnSub.setOnClickListener {
            if (count > 0)
                main.txtCount.text = "${--count}"
        }
        main.btnReset.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"
        }
    }
}