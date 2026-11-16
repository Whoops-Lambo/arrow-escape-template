package com.facebook.unity;

import android.net.Uri;
import android.os.Bundle;
import defpackage.he2;
import defpackage.ke2;
import defpackage.oe2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class FBDialogUtils {
    public static ke2 createFeedContentBuilder(Bundle bundle) {
        ke2 ke2Var = new ke2();
        if (bundle.containsKey("toId")) {
            ke2Var.g = bundle.getString("toId");
        }
        if (bundle.containsKey("link")) {
            ke2Var.h = bundle.getString("link");
        }
        if (bundle.containsKey("linkName")) {
            ke2Var.i = bundle.getString("linkName");
        }
        if (bundle.containsKey("linkCaption")) {
            ke2Var.j = bundle.getString("linkCaption");
        }
        if (bundle.containsKey("linkDescription")) {
            ke2Var.k = bundle.getString("linkDescription");
        }
        if (bundle.containsKey("picture")) {
            ke2Var.l = bundle.getString("picture");
        }
        if (bundle.containsKey("mediaSource")) {
            ke2Var.m = bundle.getString("mediaSource");
        }
        return ke2Var;
    }

    public static oe2 createShareContentBuilder(Bundle bundle) {
        oe2 oe2Var = new oe2();
        if (bundle.containsKey("content_title")) {
            oe2Var.g = bundle.getString("content_title");
        }
        if (bundle.containsKey("content_url")) {
            oe2Var.a = Uri.parse(bundle.getString("content_url"));
        }
        return oe2Var;
    }

    public static he2 intToMode(int i) {
        if (i == 0) {
            return he2.a;
        }
        if (i == 1) {
            return he2.b;
        }
        if (i == 2) {
            return he2.c;
        }
        if (i != 3) {
            return null;
        }
        return he2.d;
    }
}
