package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import defpackage.mg1;
import defpackage.qc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class OrientationLockListener {
    public mg1 a;
    public final Context b;

    public final native void nativeUpdateOrientationLockState(int i);

    public OrientationLockListener(Context context) {
        this.b = context;
        this.a = new mg1(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        mg1 mg1Var = this.a;
        mg1Var.getClass();
        mg1Var.b = new qc1(new Handler(Looper.getMainLooper()), this);
        mg1Var.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, mg1Var.b);
    }
}
