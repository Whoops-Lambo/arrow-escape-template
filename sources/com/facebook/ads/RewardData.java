package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public class RewardData implements Serializable {
    private static final long serialVersionUID = -6264212909606201882L;
    private String mCurrency;
    private int mQuantity;
    private String mUserID;

    public String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserID() {
        return this.mUserID;
    }

    public RewardData(String str, String str2, int i) {
        this.mUserID = str;
        this.mCurrency = str2;
        this.mQuantity = i;
    }

    public RewardData(String str, String str2) {
        this(str, str2, 0);
    }
}
