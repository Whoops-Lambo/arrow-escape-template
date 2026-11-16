package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeag {
    public static final w d;
    public static final w e;
    public final String a;
    public final zzeaf b;
    public final zzeaf c;

    static {
        zzeaf zzeafVar = zzeaf.PUBLIC_API_CALL;
        zzeaf zzeafVar2 = zzeaf.PUBLIC_API_CALLBACK;
        zzeag zzeagVar = new zzeag("tqgt", zzeafVar, zzeafVar2);
        zzeaf zzeafVar3 = zzeaf.DYNAMITE_ENTER;
        zzeag zzeagVar2 = new zzeag("l.dl", zzeafVar, zzeafVar3);
        zzeaf zzeafVar4 = zzeaf.READ_FROM_DISK_START;
        zzeag zzeagVar3 = new zzeag("l.rccde", zzeafVar3, zzeafVar4);
        zzeag zzeagVar4 = new zzeag("l.rfd", zzeafVar4, zzeaf.READ_FROM_DISK_END);
        zzeaf zzeafVar5 = zzeaf.CLIENT_SIGNALS_START;
        zzeag zzeagVar5 = new zzeag("l.rcc", zzeafVar3, zzeafVar5);
        zzeaf zzeafVar6 = zzeaf.CLIENT_SIGNALS_END;
        zzeag zzeagVar6 = new zzeag("l.cs", zzeafVar5, zzeafVar6);
        zzeaf zzeafVar7 = zzeaf.SERVICE_CONNECTED;
        zzeag zzeagVar7 = new zzeag("l.cts", zzeafVar6, zzeafVar7);
        zzeaf zzeafVar8 = zzeaf.GMS_SIGNALS_START;
        zzeaf zzeafVar9 = zzeaf.GMS_SIGNALS_END;
        zzeag zzeagVar8 = new zzeag("l.gs", zzeafVar8, zzeafVar9);
        zzeaf zzeafVar10 = zzeaf.GET_SIGNALS_SDKCORE_START;
        zzeag zzeagVar9 = new zzeag("l.jse", zzeafVar9, zzeafVar10);
        zzeaf zzeafVar11 = zzeaf.GET_SIGNALS_SDKCORE_END;
        zzeag zzeagVar10 = new zzeag("l.gs-sdkcore", zzeafVar10, zzeafVar11);
        zzeag zzeagVar11 = new zzeag("l.gs-pp", zzeafVar11, zzeafVar2);
        zzeaf zzeafVar12 = zzeaf.RENDERING_START;
        zzeag zzeagVar12 = new zzeag("l.render", zzeafVar12, zzeafVar2);
        zzeaf zzeafVar13 = zzeaf.RENDERING_WEBVIEW_CREATION_START;
        zzeag zzeagVar13 = new zzeag("l.render.pre", zzeafVar12, zzeafVar13);
        zzeaf zzeafVar14 = zzeaf.RENDERING_WEBVIEW_CREATION_END;
        zzeag zzeagVar14 = new zzeag("l.render.wvc", zzeafVar13, zzeafVar14);
        zzeaf zzeafVar15 = zzeaf.RENDERING_AD_COMPONENT_CREATION_END;
        zzeag zzeagVar15 = new zzeag("l.render.acc", zzeafVar14, zzeafVar15);
        zzeaf zzeafVar16 = zzeaf.RENDERING_CONFIGURE_WEBVIEW_START;
        zzeaf zzeafVar17 = zzeaf.RENDERING_CONFIGURE_WEBVIEW_END;
        zzeag zzeagVar16 = new zzeag("l.render.cfg-wv", zzeafVar16, zzeafVar17);
        zzeaf zzeafVar18 = zzeaf.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzeaf zzeafVar19 = zzeaf.RENDERING_WEBVIEW_LOAD_HTML_END;
        d = zzgzb.A(zzeagVar, zzeagVar2, zzeagVar3, zzeagVar4, zzeagVar5, zzeagVar6, zzeagVar7, zzeagVar8, zzeagVar9, zzeagVar10, zzeagVar11, zzeagVar12, zzeagVar13, zzeagVar14, zzeagVar15, zzeagVar16, new zzeag("l.render.wvlh", zzeafVar18, zzeafVar19), new zzeag("l.render.post", zzeafVar19, zzeafVar2), new zzeag("l.sodv", zzeaf.SIGNAL_ON_DISK_VALIDATION_START, zzeaf.SIGNAL_ON_DISK_VALIDATION_END), new zzeag("l.sodck", zzeaf.SIGNAL_ON_DISK_CACHE_KEY_START, zzeaf.SIGNAL_ON_DISK_CACHE_KEY_END), new zzeag("l.sodrar", zzeaf.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzeaf.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzeag("l.soddc", zzeaf.SIGNAL_ON_DISK_DECODE_START, zzeaf.SIGNAL_ON_DISK_DECODE_END));
        zzeag zzeagVar17 = new zzeag("l.al", zzeafVar, zzeafVar2);
        zzeag zzeagVar18 = new zzeag("l.al2", zzeafVar3, zzeafVar2);
        zzeag zzeagVar19 = new zzeag("l.dl", zzeafVar, zzeafVar3);
        zzeag zzeagVar20 = new zzeag("l.rcc", zzeafVar3, zzeafVar5);
        zzeag zzeagVar21 = new zzeag("l.cs", zzeafVar5, zzeafVar6);
        zzeag zzeagVar22 = new zzeag("l.cts", zzeafVar6, zzeafVar7);
        zzeag zzeagVar23 = new zzeag("l.gs", zzeafVar8, zzeafVar9);
        zzeaf zzeafVar20 = zzeaf.GET_AD_DICTIONARY_SDKCORE_START;
        zzeag zzeagVar24 = new zzeag("l.jse", zzeafVar9, zzeafVar20);
        zzeaf zzeafVar21 = zzeaf.GET_AD_DICTIONARY_SDKCORE_END;
        zzeag zzeagVar25 = new zzeag("l.gad-js", zzeafVar20, zzeafVar21);
        zzeaf zzeafVar22 = zzeaf.HTTP_RESPONSE_READY;
        zzeag zzeagVar26 = new zzeag("l.http", zzeafVar21, zzeafVar22);
        zzeaf zzeafVar23 = zzeaf.SCAR_PRELOADER_READY;
        zzeag zzeagVar27 = new zzeag("l.slas.pre", zzeafVar, zzeafVar23);
        zzeaf zzeafVar24 = zzeaf.SCAR_PRELOADER_PROCESSING_DONE;
        zzeag zzeagVar28 = new zzeag("l.slas.prel.p", zzeafVar23, zzeafVar24);
        zzeaf zzeafVar25 = zzeaf.NORMALIZATION_AD_RESPONSE_START;
        zzeag zzeagVar29 = new zzeag("l.jse-nml", zzeafVar22, zzeafVar25);
        zzeag zzeagVar30 = new zzeag("l.jse-nml", zzeafVar24, zzeafVar25);
        zzeaf zzeafVar26 = zzeaf.NORMALIZATION_AD_RESPONSE_END;
        zzeag zzeagVar31 = new zzeag("l.nml-js", zzeafVar25, zzeafVar26);
        zzeaf zzeafVar27 = zzeaf.BINDER_CALL_START;
        zzeag zzeagVar32 = new zzeag("l.nml-gmsg", zzeafVar26, zzeafVar27);
        zzeaf zzeafVar28 = zzeaf.SERVER_RESPONSE_PARSE_START;
        zzeag zzeagVar33 = new zzeag("l.nml-gmsg.s2s", zzeafVar26, zzeafVar28);
        zzeag zzeagVar34 = new zzeag("l.binder", zzeafVar27, zzeafVar28);
        zzeag zzeagVar35 = new zzeag("l.sr", zzeafVar28, zzeafVar12);
        zzeag zzeagVar36 = new zzeag("l.render", zzeafVar12, zzeafVar2);
        zzeag zzeagVar37 = new zzeag("l.t2", zzeaf.RENDERING_ADSTRING_TYPE2_FETCH_START, zzeaf.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzeaf zzeafVar29 = zzeaf.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzeaf zzeafVar30 = zzeaf.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzeag zzeagVar38 = new zzeag("l.render.na.js", zzeafVar29, zzeafVar30);
        zzeag zzeagVar39 = new zzeag("l.render.na.prep", zzeafVar30, zzeaf.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzeag zzeagVar40 = new zzeag("l.render.na.lna", zzeaf.RENDERING_NATIVE_ASSETS_LOADING_START, zzeaf.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzeag zzeagVar41 = new zzeag("l.render.wvc", zzeafVar13, zzeafVar14);
        zzeag zzeagVar42 = new zzeag("l.render.acc", zzeafVar14, zzeafVar15);
        zzeag zzeagVar43 = new zzeag("l.render.cfg-wv", zzeafVar16, zzeafVar17);
        zzeag zzeagVar44 = new zzeag("l.render.pre", zzeafVar12, zzeafVar13);
        zzeag zzeagVar45 = new zzeag("l.render.post", zzeafVar19, zzeafVar2);
        zzeag zzeagVar46 = new zzeag("l.render.na.post", zzeafVar17, zzeafVar2);
        zzeag zzeagVar47 = new zzeag("l.render.wvlh", zzeafVar18, zzeafVar19);
        zzeag zzeagVar48 = new zzeag("l.na.b", zzeaf.NATIVE_ASSETS_LOADING_BASIC_START, zzeaf.NATIVE_ASSETS_LOADING_BASIC_END);
        zzeag zzeagVar49 = new zzeag("l.na.im", zzeaf.NATIVE_ASSETS_LOADING_IMAGE_START, zzeaf.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzeag zzeagVar50 = new zzeag("l.na.imc", zzeaf.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzeaf.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzeag zzeagVar51 = new zzeag("l.na.l", zzeaf.NATIVE_ASSETS_LOADING_LOGO_START, zzeaf.NATIVE_ASSETS_LOADING_LOGO_END);
        zzeag zzeagVar52 = new zzeag("l.na.ic", zzeaf.NATIVE_ASSETS_LOADING_ICON_START, zzeaf.NATIVE_ASSETS_LOADING_ICON_END);
        zzeag zzeagVar53 = new zzeag("l.na.a", zzeaf.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzeaf.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzeaf zzeafVar31 = zzeaf.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzeaf zzeafVar32 = zzeaf.NATIVE_ASSETS_LOADING_VIDEO_END;
        e = zzgzb.A(zzeagVar17, zzeagVar18, zzeagVar19, zzeagVar20, zzeagVar21, zzeagVar22, zzeagVar23, zzeagVar24, zzeagVar25, zzeagVar26, zzeagVar27, zzeagVar28, zzeagVar29, zzeagVar30, zzeagVar31, zzeagVar32, zzeagVar33, zzeagVar34, zzeagVar35, zzeagVar36, zzeagVar37, zzeagVar38, zzeagVar39, zzeagVar40, zzeagVar41, zzeagVar42, zzeagVar43, zzeagVar44, zzeagVar45, zzeagVar46, zzeagVar47, zzeagVar48, zzeagVar49, zzeagVar50, zzeagVar51, zzeagVar52, zzeagVar53, new zzeag("l.na.v", zzeafVar31, zzeafVar32), new zzeag("l.na.vc", zzeaf.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzeafVar32), new zzeag("l.na.m", zzeaf.NATIVE_ASSETS_LOADING_MEDIA_START, zzeaf.NATIVE_ASSETS_LOADING_MEDIA_END), new zzeag("l.na.c", zzeaf.NATIVE_ASSETS_LOADING_CUSTOM_START, zzeaf.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzeag("l.na.o", zzeaf.NATIVE_ASSETS_LOADING_OMID_START, zzeaf.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzeag(String str, zzeaf zzeafVar, zzeaf zzeafVar2) {
        this.a = str;
        this.b = zzeafVar;
        this.c = zzeafVar2;
    }
}
