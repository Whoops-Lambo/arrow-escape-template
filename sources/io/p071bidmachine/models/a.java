package io.p071bidmachine.models;

import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.unified.c;
import io.p071bidmachine.unified.d;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    c createUnifiedCallback(AdProcessCallback adProcessCallback);

    Map getCustomParams();

    b getParams();

    void hide();

    void load(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit);

    Boolean onClicked();

    void onClosed(boolean z);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onShowFailed();

    void onShown();
}
