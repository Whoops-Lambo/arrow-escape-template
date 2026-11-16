package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzbmv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbmv> CREATOR = new zzbmw();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final com.google.android.gms.ads.internal.client.zzfw f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static NativeAdOptions d(zzbmv zzbmvVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbmvVar == null) {
            return builder.build();
        }
        int i = zzbmvVar.a;
        int i2 = 2;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbmvVar.e);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbmvVar.g);
                    builder.setMediaAspectRatio(zzbmvVar.h);
                    builder.enableCustomClickGestureDirection(zzbmvVar.i, zzbmvVar.j);
                    int i3 = zzbmvVar.k;
                    if (i3 == 0) {
                        i2 = 1;
                    } else if (i3 == 2) {
                        i2 = 3;
                    } else if (i3 != 1) {
                        i2 = 1;
                    }
                    builder.zzi(i2);
                }
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmvVar.f;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
            builder.setAdChoicesPlacement(zzbmvVar.e);
        }
        builder.setReturnUrlsForImageAssets(zzbmvVar.b);
        builder.setRequestMultipleImages(zzbmvVar.d);
        return builder.build();
    }

    public zzbmv(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar;
        boolean zShouldReturnUrlsForImageAssets = nativeAdOptions.shouldReturnUrlsForImageAssets();
        int imageOrientation = nativeAdOptions.getImageOrientation();
        boolean zShouldRequestMultipleImages = nativeAdOptions.shouldRequestMultipleImages();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (nativeAdOptions.getVideoOptions() != null) {
            zzfwVar = new com.google.android.gms.ads.internal.client.zzfw(nativeAdOptions.getVideoOptions());
        } else {
            zzfwVar = null;
        }
        this(4, zShouldReturnUrlsForImageAssets, imageOrientation, zShouldRequestMultipleImages, adChoicesPlacement, zzfwVar, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.g);
        SafeParcelWriter.writeInt(parcel, 8, this.h);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.j);
        SafeParcelWriter.writeInt(parcel, 11, this.k);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbmv(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzfw zzfwVar, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = zzfwVar;
        this.g = z3;
        this.h = i4;
        this.j = z4;
        this.i = i5;
        this.k = i6;
    }
}
