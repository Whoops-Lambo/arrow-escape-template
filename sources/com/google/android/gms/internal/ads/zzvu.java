package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import defpackage.r85;
import defpackage.yi4;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzvu {
    void a(Surface surface);

    default boolean b(r85 r85Var) {
        return false;
    }

    ByteBuffer c(int i);

    int d(MediaCodec.BufferInfo bufferInfo);

    void g(int i);

    void i(int i, long j);

    void j(int i);

    void n(int i, int i2, int i3, long j);

    void o(int i, zziz zzizVar, long j, int i2);

    void p(ArrayList arrayList);

    void q(Bundle bundle);

    int zze();

    MediaFormat zzg();

    ByteBuffer zzh(int i);

    void zzk();

    void zzl();

    void zzo();

    default void h(yi4 yi4Var) {
        yi4Var.run();
    }
}
