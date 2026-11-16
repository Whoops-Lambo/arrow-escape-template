package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface kgy<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseBackupButton();

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i);

    void setListener(ahm ahmVar);

    void setShowDislike(boolean z);

    void setShowEndCardNextAd(boolean z, ioy ioyVar);

    void setShowPlayableNextAd(boolean z, ioy ioyVar);

    void setShowSkip(boolean z);

    void setShowSound(boolean z);

    void setSkipEnable(boolean z);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
