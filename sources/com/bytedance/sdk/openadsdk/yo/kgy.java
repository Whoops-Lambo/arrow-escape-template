package com.bytedance.sdk.openadsdk.yo;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.ct;
import com.bytedance.sdk.component.ahm.kgy.gf;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.noq;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.ahm.kgy.twf;
import com.bytedance.sdk.component.ahm.kgy.vs;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy implements INetWork {
    protected nu ahm;
    protected nu kgy;

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream = null;
        int i = 0;
        try {
            try {
                kus kusVarAhm = this.ahm.kgy(new at.kgy().kgy().kgy("gecko").ahm(str).ahm()).ahm();
                int iRz = kusVarAhm.rz();
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(kusVarAhm.noq().rz());
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int i2 = bufferedInputStream2.read(bArr, 0, 2048);
                            if (i2 == -1) {
                                CloseableUtils.close(bufferedInputStream2);
                                return;
                            }
                            bufferOutputStream.write(bArr, 0, i2);
                        }
                    } catch (Exception e) {
                        e = e;
                        i = iRz;
                        bufferedInputStream = bufferedInputStream2;
                        rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4sUoyNU", "f+srlBawfemFXuBSnho=", "X+E6mw+zaMOmQ9tY", 136);
                        throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        CloseableUtils.close(bufferedInputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = iRz;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private Map<String, String> kgy(noq noqVar) {
        if (noqVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < noqVar.kgy(); i++) {
            map.put(noqVar.kgy(i), noqVar.ahm(i));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        kus kusVarAhm = this.kgy.kgy(new at.kgy().kgy().ahm(str).kgy("gecko").ahm()).ahm();
        vs vsVarNoq = kusVarAhm.noq();
        return new Response(kgy(kusVarAhm.yo()), (kusVarAhm.rz() != 200 || vsVarNoq == null) ? null : vsVarNoq.ahm(), kusVarAhm.rz(), kusVarAhm.ct());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        ct.kgy kgyVar = new ct.kgy();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                kgyVar.kgy((String) pair.first, (String) pair.second);
            }
        }
        kus kusVarAhm = this.kgy.kgy(new at.kgy().ahm(str).kgy((twf) kgyVar.kgy()).kgy("gecko").ahm()).ahm();
        vs vsVarNoq = kusVarAhm.noq();
        return new Response(kgy(kusVarAhm.yo()), (kusVarAhm.rz() != 200 || vsVarNoq == null) ? null : vsVarNoq.ahm(), kusVarAhm.rz(), kusVarAhm.ct());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.kgy.kgy(new at.kgy().kgy().ahm(str).kgy("gecko").ahm()).kgy(new com.bytedance.sdk.component.ahm.kgy.rz() { // from class: com.bytedance.sdk.openadsdk.yo.kgy.1
            @Override // com.bytedance.sdk.component.ahm.kgy.rz
            public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, kus kusVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.ahm.kgy.rz
            public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, IOException iOException) {
            }
        });
    }

    public kgy() {
        nu.kgy kgyVar = new nu.kgy();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.kgy = kgyVar.kgy(10L, timeUnit).ahm(10L, timeUnit).rz(10L, timeUnit).kgy();
        this.ahm = new nu.kgy().kgy(10L, timeUnit).ahm(30L, timeUnit).rz(30L, timeUnit).kgy();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        kus kusVarAhm = this.kgy.kgy(new at.kgy().ahm(str).kgy(twf.kgy(gf.kgy("application/json; charset=utf-8"), str2)).kgy("gecko").ahm()).ahm();
        vs vsVarNoq = kusVarAhm.noq();
        return new Response(kgy(kusVarAhm.yo()), (kusVarAhm.rz() != 200 || vsVarNoq == null) ? null : vsVarNoq.ahm(), kusVarAhm.rz(), kusVarAhm.ct());
    }
}
