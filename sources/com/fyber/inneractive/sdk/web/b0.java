package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface b0 extends j1 {
    void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError);

    void a(boolean z, Orientation orientation);

    boolean a(String str);

    void b(boolean z);

    void c();

    void d();

    void e();

    void onClose();
}
