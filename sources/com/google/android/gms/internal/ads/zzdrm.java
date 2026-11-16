package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface zzdrm {
    void a(View view);

    boolean b(Bundle bundle);

    JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void e(zzbou zzbouVar);

    void f(Bundle bundle);

    void g(View view, Map map, Map map2, zzdtb zzdtbVar, zzdtb zzdtbVar2);

    void h(View view);

    JSONObject i(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i);

    void k(Bundle bundle);

    void l(com.google.android.gms.ads.internal.client.zzdg zzdgVar);

    void n(MotionEvent motionEvent, View view);

    void o(com.google.android.gms.ads.internal.client.zzdc zzdcVar);

    void p(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType);

    void q(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void x();

    void zzA();

    void zzd(String str);

    void zzg();

    boolean zzh();

    void zzn();

    void zzq();

    int zzu();

    boolean zzv();
}
