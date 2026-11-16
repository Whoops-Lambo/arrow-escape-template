package com.facebook.ads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public class NativeAdViewAttributes {
    private final NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getButtonBorderColor() {
        return 0;
    }

    @Deprecated
    public int getButtonColor() {
        return 0;
    }

    @Deprecated
    public int getButtonTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextSize() {
        return 0;
    }

    @Deprecated
    public int getTitleTextColor() {
        return 0;
    }

    @Deprecated
    public int getTitleTextSize() {
        return 0;
    }

    @Nullable
    @Deprecated
    public Typeface getTypeface() {
        return null;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplay(boolean z) {
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        return this;
    }

    public NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    public NativeAdViewAttributes setBackgroundColor(int i) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i) {
        this.mNativeAdViewAttributesApi.setCTATextColor(i);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(i);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(i);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface);
        return this;
    }

    public NativeAdViewAttributes(Context context) {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoader(context).createNativeAdViewAttributesApi();
    }

    @Deprecated
    public boolean getAutoplay() {
        return AdSettings.isVideoAutoplay();
    }

    @Deprecated
    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    @Deprecated
    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }
}
