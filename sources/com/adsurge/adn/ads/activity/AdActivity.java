package com.adsurge.adn.ads.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.adsurge.adn.p004a.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class AdActivity extends Activity {
    public com.adsurge.adn.p004a.a a;

    @Override // android.app.Activity
    public void onBackPressed() {
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        com.adsurge.adn.p004a.a aVarA = c.a(getIntent().getIntExtra("adi", 0));
        if (aVarA != null) {
            ActivityDelegateAdapter activityDelegateAdapter = new ActivityDelegateAdapter(aVarA, this);
            activityDelegateAdapter.onBeforeCreate(this, bundle);
            this.a = activityDelegateAdapter;
            aVarA = activityDelegateAdapter;
        }
        super.onCreate(bundle);
        if (aVarA != null) {
            aVarA.onAfterCreate(bundle);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onDestroy();
        }
        c.a(this.a);
        this.a = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onPause();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.adsurge.adn.p004a.a aVar = this.a;
        if (aVar != null) {
            aVar.onStop();
        }
    }
}
