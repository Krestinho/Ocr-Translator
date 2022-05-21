package carlos.castillo.translator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import carlos.castillo.translator.databinding.ActivityMainBinding
import carlos.castillo.translator.databinding.CameraOcrBinding
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.launchCameraButton.setOnClickListener {
            val intent = Intent(this, CameraOcr::class.java)
            startActivity(intent)
        }

    }
}