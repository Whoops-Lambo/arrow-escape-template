package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.mx3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface zzcly extends com.google.android.gms.ads.internal.client.zza, zzdmj, zzclp, zzbtq, zzcng, zzcnl, zzbuc, zzbfr, zzcnp, zzn, zzcns, zzcnt, zzcir, zzcnu {
    void B(String str, String str2);

    void C(boolean z);

    void D(zzcoj zzcojVar);

    void E(int i);

    void F(boolean z);

    void G(zzflq zzflqVar, zzflt zzfltVar);

    void I(zzbmt zzbmtVar);

    void J(String str, zzbqs zzbqsVar);

    void M(String str, zzbqs zzbqsVar);

    boolean P();

    ListenableFuture S();

    void T(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void U(Context context);

    boolean X(int i, boolean z);

    void Y();

    zzemw a();

    void a0(boolean z);

    zzbbo b();

    void b0(int i);

    boolean c();

    void c0(zzdvk zzdvkVar);

    boolean canGoBack();

    void d0(zzemw zzemwVar);

    void destroy();

    void e();

    void e0(String str, mx3 mx3Var);

    void f0(zzemy zzemyVar);

    com.google.android.gms.ads.internal.overlay.zzm g();

    void g0(boolean z);

    @Override // com.google.android.gms.internal.ads.zzcnl, com.google.android.gms.internal.ads.zzcir
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean h();

    void h0(int i, boolean z);

    boolean i();

    boolean isAttachedToWindow();

    void j();

    void j0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    zzflt k();

    zzemy l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(boolean z);

    void measure(int i, int i2);

    void o();

    void onPause();

    void onResume();

    boolean p();

    void q();

    void r();

    zzbmt s();

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t(zzbhe zzbheVar);

    zzbhe u();

    Context v();

    void w();

    void y();

    zzflq zzC();

    WebView zzD();

    View zzE();

    ArrayList zzF();

    void zzJ();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    zzcoj zzN();

    String zzO();

    zzcmj zzP();

    boolean zzR();

    zzfmn zzT();

    zzcnf zzh();

    Activity zzj();

    com.google.android.gms.ads.internal.zza zzk();

    zzbke zzq();

    VersionInfoParcel zzs();
}
