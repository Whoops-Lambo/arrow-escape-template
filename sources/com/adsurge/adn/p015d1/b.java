package com.adsurge.adn.p015d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends BroadcastReceiver implements View.OnAttachStateChangeListener {
    public a a;
    public boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(float f);
    }

    public void a(Context context) {
        try {
            if (this.b) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            context.getApplicationContext().registerReceiver(this, intentFilter);
            this.b = true;
        } catch (Exception unused) {
        }
    }

    public void b(Context context) {
        if (this.b) {
            try {
                context.getApplicationContext().unregisterReceiver(this);
                this.b = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 3) == 3) {
            this.a.a(((AudioManager) context.getSystemService("audio")).getStreamVolume(3));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        a(view.getContext());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b(view.getContext());
    }
}
