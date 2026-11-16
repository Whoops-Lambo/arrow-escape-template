package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface BaseViewModel {
    void setClickSubject(c cVar);

    void setConcreteSubject(d dVar);

    void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener);

    void setEffectSubject(f fVar);

    void setModelDataAndBind();

    void setReportSubject(h hVar);
}
