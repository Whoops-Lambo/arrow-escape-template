package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4981t;
import com.ironsource.R6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, r rVar) {
        t tVar;
        InneractiveErrorCode inneractiveErrorCode;
        InneractiveErrorCode inneractiveErrorCode2;
        t tVar2;
        x xVarA;
        Set<com.fyber.inneractive.sdk.model.vast.r> setKeySet;
        InneractiveErrorCode inneractiveErrorCode3;
        InneractiveErrorCode inneractiveErrorCode4;
        String str;
        String str2 = gVar.i;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = t.VAST_ERROR_INVALID_RESPONSE;
            if (gVar.j != null) {
                xVarA = new x().a(gVar.j, "exception");
                t tVar3 = tVar2;
                inneractiveErrorCode = inneractiveErrorCode2;
                tVar = tVar3;
            }
            t tVar4 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar4;
            xVarA = null;
        } else {
            if ("ErrorNoCompatibleMediaFile".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
                LinkedHashMap linkedHashMap = gVar.O;
                if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null && setKeySet.size() > 0) {
                    x xVar = new x();
                    JSONArray jSONArray = new JSONArray();
                    for (com.fyber.inneractive.sdk.model.vast.r rVar2 : setKeySet) {
                        try {
                            f fVar = (f) linkedHashMap.get(rVar2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", rVar2.g);
                            jSONObject.put("bitrate", rVar2.e);
                            jSONObject.put("mime", TextUtils.isEmpty(rVar2.d) ? "na" : rVar2.d);
                            jSONObject.put(C4981t.g, rVar2.a);
                            e eVar = fVar.a;
                            jSONObject.put("reason", eVar != null ? eVar.value : 0);
                            jSONObject.put("required_value", fVar.b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                            IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                        }
                    }
                    xVar.a(jSONArray, "media_files");
                    inneractiveErrorCode = inneractiveErrorCode2;
                    tVar = tVar2;
                    xVarA = xVar;
                }
            } else if ("VastErrorTooManyWrappers".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_TOO_MANY_WRAPPERS;
                xVarA = new x().a(Integer.valueOf(IAConfigManager.Q.j.b), "max");
                t tVar5 = tVar2;
                inneractiveErrorCode = inneractiveErrorCode2;
                tVar = tVar5;
            } else if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar2 = t.INTERNAL_CONFIG_MISMATCH;
            } else {
                if ("VastErrorUnsecure".equals(str2)) {
                    inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                    tVar2 = t.VAST_ERROR_UNSECURE_URL;
                } else {
                    tVar = null;
                    inneractiveErrorCode = null;
                }
                xVarA = null;
            }
            t tVar6 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar6;
            xVarA = null;
        }
        if (tVar != null) {
            JSONArray jSONArrayB = rVar == null ? null : rVar.b();
            w wVar = new w(gVar);
            wVar.b = tVar;
            wVar.a = inneractiveAdRequest;
            wVar.d = jSONArrayB;
            if (xVarA != null) {
                wVar.f.put(xVarA.a);
            }
            wVar.a((String) null);
        }
        if (gVar.n != UnitDisplayType.NATIVE) {
            ArrayList arrayList = gVar.P;
            if (arrayList == null || arrayList.size() <= 0) {
                inneractiveErrorCode3 = inneractiveErrorCode;
            } else {
                u uVar = u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray jSONArrayB2 = rVar == null ? null : rVar.b();
                w wVar2 = new w(gVar);
                wVar2.c = uVar;
                wVar2.a = inneractiveAdRequest;
                wVar2.d = jSONArrayB2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) arrayList.get(i);
                    hVar.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("w", hVar.a);
                        jSONObject3.put(CmcdData.STREAMING_FORMAT_HLS, hVar.b);
                        jSONObject3.put(R6.K0, hVar.g);
                        jSONObject3.put("clt", hVar.h);
                        String str3 = hVar.f;
                        if (str3 != null) {
                            jSONObject3.put("content", str3);
                            str = "HTMLResource";
                        } else {
                            str = null;
                        }
                        inneractiveErrorCode4 = inneractiveErrorCode;
                        try {
                            l lVar = hVar.d;
                            if (lVar != null) {
                                jSONObject3.put("content", lVar.b);
                                jSONObject3.put("creativeType", hVar.d.a);
                                str = "StaticResource";
                            }
                            if (!TextUtils.isEmpty(hVar.e)) {
                                jSONObject3.put("content", hVar.e);
                                str = "iFrameResource";
                            }
                            if (str != null) {
                                jSONObject3.put("type", str);
                            }
                            b bVar = hVar.i;
                            if (bVar != null) {
                                jSONObject3.put("reason", bVar.a);
                                jSONObject3.put("exception", hVar.i.getMessage());
                            }
                        } catch (JSONException e) {
                            e = e;
                            IAlog.a("Failed creating Companion json object: %s", e.getMessage());
                            jSONObject3 = null;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        inneractiveErrorCode4 = inneractiveErrorCode;
                    }
                    jSONArray2.put(jSONObject3);
                    i = i2;
                    inneractiveErrorCode = inneractiveErrorCode4;
                }
                inneractiveErrorCode3 = inneractiveErrorCode;
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                }
                wVar2.f.put(jSONObject2);
                wVar2.a((String) null);
            }
            com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.N;
            int size2 = bVar2 != null ? bVar2.g.size() : 0;
            ArrayList arrayList2 = gVar.P;
            int size3 = arrayList2 != null ? arrayList2.size() : 0;
            u uVar2 = u.NUMBER_OF_COMPANIONS;
            JSONArray jSONArrayB3 = rVar == null ? null : rVar.b();
            w wVar3 = new w(gVar);
            wVar3.c = uVar2;
            wVar3.a = inneractiveAdRequest;
            wVar3.d = jSONArrayB3;
            JSONObject jSONObject4 = new JSONObject();
            Integer numValueOf = Integer.valueOf(size2 + size3);
            try {
                jSONObject4.put("number_of_endcards", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", numValueOf);
            }
            wVar3.f.put(jSONObject4);
            wVar3.a((String) null);
        } else {
            inneractiveErrorCode3 = inneractiveErrorCode;
        }
        if (gVar.N != null) {
            i iVar = new i(gVar);
            if (iVar.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                u uVar3 = u.OMID_VAST_DETECTION;
                JSONArray jSONArrayB4 = rVar == null ? null : rVar.b();
                w wVar4 = new w(gVar);
                wVar4.c = uVar3;
                wVar4.a = inneractiveAdRequest;
                wVar4.d = jSONArrayB4;
                int size4 = iVar.size();
                int i3 = 0;
                while (i3 < size4) {
                    Object obj = iVar.get(i3);
                    i3++;
                    com.fyber.inneractive.sdk.measurement.h hVar2 = (com.fyber.inneractive.sdk.measurement.h) obj;
                    hVar2.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(hVar2.b()));
                        if (!hVar2.b()) {
                            jSONObject6.put("error_reason", hVar2.a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put("verifications", jSONArray3);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "verifications", jSONArray3);
                }
                wVar4.f.put(jSONObject5);
                wVar4.a((String) null);
            }
        }
        return inneractiveErrorCode3;
    }
}
