package com.facebook;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public final SharedPreferences a;

    public c(int i) {
        switch (i) {
            case 1:
                SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                this.a = sharedPreferences;
                break;
            case 2:
                SharedPreferences sharedPreferences2 = a0.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences2.getClass();
                this.a = sharedPreferences2;
                break;
            default:
                SharedPreferences sharedPreferences3 = a0.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences3.getClass();
                this.a = sharedPreferences3;
                break;
        }
    }

    public c(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }
}
