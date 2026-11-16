package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h50;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "com/explorestack/protobuf/adcom/c", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookRequestError implements Parcelable {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Object g;
    public final String h;
    public final u i;
    public static final com.explorestack.protobuf.adcom.c j = new com.explorestack.protobuf.adcom.c(26);

    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new b(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        u uVar = this.i;
        if (uVar != null) {
            return uVar.getLocalizedMessage();
        }
        return null;
    }

    public final String toString() {
        return "{HttpStatus: " + this.a + ", errorCode: " + this.b + ", subErrorCode: " + this.c + ", errorType: " + this.d + ", errorMessage: " + a() + "}";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, u uVar, boolean z) {
        Set set;
        Set set2;
        Set set3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str3;
        this.f = str4;
        this.g = obj;
        this.h = str2;
        com.explorestack.protobuf.adcom.c cVar = j;
        int i4 = 2;
        if (uVar != null) {
            this.i = uVar;
        } else {
            this.i = new e0(this, a());
            com.facebook.internal.t tVarG = cVar.g();
            Map map = (Map) tVarG.b;
            Map map2 = (Map) tVarG.c;
            Map map3 = (Map) tVarG.a;
            if (z) {
                i4 = 3;
            } else if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set3 = (Set) map3.get(Integer.valueOf(i2))) != null && !set3.contains(Integer.valueOf(i3)))) {
                if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = (Set) map2.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
                    i4 = 1;
                } else if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set = (Set) map.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                    i4 = 3;
                }
            }
        }
        cVar.g();
        int i5 = com.facebook.internal.s.$EnumSwitchMapping$0[h50.C(i4)];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(a());
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof u ? (u) exc : new u(exc), false);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
