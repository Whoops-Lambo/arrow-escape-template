package com.adsurge.adn.ads.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.annotation.NonNull;
import com.adsurge.adn.X.A;
import com.adsurge.adn.X.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class ActivityDelegateAdapter implements com.adsurge.adn.p004a.a {
    public final com.adsurge.adn.p004a.a a;
    public final Activity b;
    public OnBackInvokedCallback c;

    public final /* synthetic */ void a() {
        this.a.onBackPressed();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.adsurge.adn.p004a.a
    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.onActivityResult(i, i2, intent);
    }

    @Override // com.adsurge.adn.p004a.a
    public void onAfterCreate(Bundle bundle) {
        this.a.onAfterCreate(bundle);
        if (u.a) {
            this.c = new OnBackInvokedCallback() { // from class: com.adsurge.adn.ads.activity.a
                public final void onBackInvoked() {
                    this.a.a();
                }
            };
            try {
                this.b.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.c);
            } catch (Throwable unused) {
            }
        }
        if (u.b && A.b()) {
            try {
                this.b.setRequestedOrientation(14);
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.adsurge.adn.p004a.a
    public void onBackPressed() {
        this.a.onBackPressed();
    }

    @Override // com.adsurge.adn.p004a.a
    public void onBeforeCreate(Activity activity, Bundle bundle) {
        this.a.onBeforeCreate(activity, bundle);
    }

    @Override // com.adsurge.adn.p004a.a
    public void onConfigurationChanged(Configuration configuration) {
        this.a.onConfigurationChanged(configuration);
    }

    @Override // com.adsurge.adn.p004a.a
    public void onDestroy() {
        if (u.a && this.c != null) {
            try {
                this.b.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.c);
            } catch (Throwable unused) {
            }
        }
        this.a.onDestroy();
    }

    @Override // com.adsurge.adn.p004a.a
    public void onPause() {
        this.a.onPause();
    }

    @Override // com.adsurge.adn.p004a.a
    public void onResume() {
        this.a.onResume();
    }

    @Override // com.adsurge.adn.p004a.a
    public void onStop() {
        this.a.onStop();
    }

    public ActivityDelegateAdapter(@NonNull com.adsurge.adn.p004a.a aVar, @NonNull Activity activity) {
        this.a = aVar;
        this.b = activity;
    }
}
