package dbpackage

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.genjulypone.R
import kotlinx.android.synthetic.main.activity_db.*

class DbActivity : AppCompatActivity() {
    lateinit var sp : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_db)

        sp = getSharedPreferences("myfile", MODE_PRIVATE)
           editTextName.setText(sp.getString("keyname",""))

        buttonSave.setOnClickListener {

           var name =  editTextName.text.toString()

           var editor = sp.edit()
            editor.putString("keyname",name)
            editor.commit()

            editTextName.setText("")
        }
    }
}