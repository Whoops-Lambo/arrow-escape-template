package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.facebook.share.model.ShareMedia;
import defpackage.wt0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001\u0002¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/ShareMedia;", "M", "Lwt0;", "B", "", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends wt0> implements Parcelable {
    public final Bundle a;

    /* JADX INFO: renamed from: a */
    public abstract int getC();

    public ShareMedia(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.a = bundle == null ? new Bundle() : bundle;
    }

    public ShareMedia(wt0 wt0Var) {
        this.a = new Bundle((Bundle) wt0Var.a);
    }
}
