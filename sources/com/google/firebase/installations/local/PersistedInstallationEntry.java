package com.google.firebase.installations.local;

import defpackage.e32;
import defpackage.nj;
import defpackage.tf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class PersistedInstallationEntry {
    public static final /* synthetic */ int a = 0;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract tf i();

    public final boolean h() {
        if (f() == 4) {
            return true;
        }
        return false;
    }
}
