package com.example.platform_univ.modulo.login.mvp

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface LoginMVP {
    interface View{
        fun showProgres()
        fun hideProgres()
        fun showToask(message:String)
        fun logInSuccess()
        fun logInError()
    }

    interface Presenter{
        fun logIn(user:String, password:String)
    }

    interface Model{
        fun logIn(user:String, password:String): Task<AuthResult>
    }
}
