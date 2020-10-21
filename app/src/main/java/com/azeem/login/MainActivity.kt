package com.azeem.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*
import android.text.TextWatcher as TextWatcher1


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        eml.addTextChangedListener(object : TextWatcher1{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                if (android.util.Patterns.EMAIL_ADDRESS.matcher(eml.text.toString()).matches())
                    btnlogin.isEnabled = true
                else{
                    btnlogin.isEnabled = false
                    eml.setError("Invalid Email")
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })


        pass.addTextChangedListener(object : TextWatcher1{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                pass.error = "wertyhjnbv- "
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                if (android.util.Patterns.EMAIL_ADDRESS.matcher(pass.text.toString()).matches())
                    btnlogin.isEnabled = true
                else{
                    btnlogin.isEnabled = false
                    pass.error = "Password should contain Ac , @ , . , | , ! , - "
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })




        }





    }





