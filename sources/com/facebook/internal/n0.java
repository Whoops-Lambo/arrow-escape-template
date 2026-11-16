package com.facebook.internal;

import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import defpackage.lz;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    public TreeSet a;
    public final /* synthetic */ int b;

    /* JADX WARN: Code duplicated, block: B:12:0x0011 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #1 {all -> 0x000f, blocks: (B:5:0x0004, B:7:0x0008, B:20:0x002b, B:22:0x002f, B:24:0x0035, B:25:0x0037, B:27:0x003b, B:29:0x0049, B:36:0x005b, B:35:0x0058, B:12:0x0011, B:19:0x0029, B:18:0x0025, B:15:0x001f), top: B:43:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void a(boolean z) {
        o0 o0Var;
        TreeSet treeSetH;
        if (z) {
            o0Var = o0.a;
            if (lz.a.contains(o0.class)) {
                treeSetH = null;
                this.a = treeSetH;
            } else {
                treeSetH = o0Var.h(this);
                this.a = treeSetH;
            }
        } else {
            try {
                TreeSet treeSet = this.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    o0Var = o0.a;
                    if (lz.a.contains(o0.class)) {
                        treeSetH = null;
                        this.a = treeSetH;
                    } else {
                        try {
                            treeSetH = o0Var.h(this);
                        } catch (Throwable th) {
                            lz.a(o0.class, th);
                            treeSetH = null;
                        }
                        this.a = treeSetH;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            switch (this.b) {
                case 2:
                    if (com.facebook.a0.a().getApplicationInfo().targetSdkVersion >= 30) {
                        Log.w(lz.a.contains(o0.class) ? null : "com.facebook.internal.o0", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    }
                    break;
                default:
                    break;
            }
            throw th2;
        }
    }

    public final void c() {
    }

    public /* synthetic */ n0(int i) {
        this.b = i;
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return FbValidationUtils.FB_PACKAGE;
            case 3:
                return "com.facebook.orca";
            default:
                return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }
}
