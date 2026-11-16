package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (str.startsWith("assets://")) {
            return c.a().a(str, viewGroup, aVar);
        }
        if (new File(str).exists()) {
            return c.a().a(str, viewGroup, aVar);
        }
        return null;
    }
}
