package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class e4 extends v2 {
    private final i3 n;
    private final Context o;

    public e4(i3 i3Var, Context context) {
        super(v2.c.DETAIL);
        this.n = i3Var;
        this.o = context;
        this.c = t();
        this.d = s();
    }

    private SpannedString q() {
        if (!this.n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.c(), -16777216));
        if (this.n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", this.o.getColor(R.color.applovin_sdk_orangeColor)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.k(), -16777216));
        }
        if (!this.n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString u() {
        if (!this.n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!StringUtils.isValidString(this.n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.n.z() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.v2
    public int e() {
        return this.o.getColor(R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.v2
    public int h() {
        int iH = this.n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.v2
    public boolean o() {
        return this.n.q() != i3.a.MISSING;
    }

    public i3 r() {
        return this.n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.c) + ", detailText=" + ((Object) this.d) + ", network=" + this.n + "}";
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.n.q() == i3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        } else if (this.n.q() == i3.a.INCOMPLETE_INTEGRATION && this.n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        int i;
        if (o()) {
            i = -16777216;
        } else {
            i = -7829368;
        }
        return StringUtils.createSpannedString(this.n.g(), i, 18, 1);
    }

    @Override // com.applovin.impl.v2
    public int d() {
        if (o()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.h();
    }
}
