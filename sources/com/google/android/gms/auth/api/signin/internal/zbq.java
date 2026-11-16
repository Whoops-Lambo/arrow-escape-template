package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zbq extends com.google.android.gms.internal.p000authapi.zbb implements zbr {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                d.c();
                return false;
            case 102:
                Status status = (Status) com.google.android.gms.internal.p000authapi.zbc.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                d1(status);
                break;
            case 103:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.zbc.a(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.b(parcel);
                Y0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
}
