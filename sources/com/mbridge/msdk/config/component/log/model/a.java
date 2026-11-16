package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.q63;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    private int a = 2;
    private int b = 15000;
    private int c = 0;
    private int d = 0;
    private int e = 50;
    private int f = 50;
    private int g = 604800000;
    private int h;
    private Map<String, Object> i;
    private Map<String, Object> j;
    private Map<String, Object> k;

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String strJ = q63.j("181", map);
                if (!TextUtils.isEmpty(strJ) && !"null".equalsIgnoreCase(strJ)) {
                    try {
                        this.a = Integer.parseInt(strJ);
                    } catch (Exception e) {
                        q0.b("LogSenderModel", e.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String strJ2 = q63.j("162", map);
                if (!TextUtils.isEmpty(strJ2) && !"null".equalsIgnoreCase(strJ2)) {
                    try {
                        this.b = Integer.parseInt(strJ2) * 1000;
                    } catch (Exception e2) {
                        q0.b("LogSenderModel", e2.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String strJ3 = q63.j("182", map);
                if (!TextUtils.isEmpty(strJ3) && !"null".equalsIgnoreCase(strJ3)) {
                    try {
                        this.c = Integer.parseInt(strJ3);
                    } catch (Exception e3) {
                        q0.b("LogSenderModel", e3.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String strJ4 = q63.j("183", map);
                if (!TextUtils.isEmpty(strJ4) && !"null".equalsIgnoreCase(strJ4)) {
                    try {
                        this.d = Integer.parseInt(strJ4);
                    } catch (Exception e4) {
                        q0.b("LogSenderModel", e4.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String strJ5 = q63.j("174", map);
                if (!TextUtils.isEmpty(strJ5) && !"null".equalsIgnoreCase(strJ5)) {
                    try {
                        this.e = Integer.parseInt(strJ5);
                    } catch (Exception e5) {
                        q0.b("LogSenderModel", e5.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String strJ6 = q63.j("184", map);
                if (!TextUtils.isEmpty(strJ6) && !"null".equalsIgnoreCase(strJ6)) {
                    try {
                        this.f = Integer.parseInt(strJ6);
                    } catch (Exception e6) {
                        q0.b("LogSenderModel", e6.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String strJ7 = q63.j("185", map);
                if (!TextUtils.isEmpty(strJ7) && !"null".equalsIgnoreCase(strJ7)) {
                    try {
                        this.g = Integer.parseInt(strJ7) * 1000;
                    } catch (Exception e7) {
                        q0.b("LogSenderModel", e7.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String strJ8 = q63.j("178", map);
                if (!TextUtils.isEmpty(strJ8) && !"null".equalsIgnoreCase(strJ8)) {
                    try {
                        this.h = Integer.parseInt(strJ8);
                    } catch (Exception e8) {
                        q0.b("LogSenderModel", e8.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.b;
    }

    public String c() {
        Map<String, Object> map = this.i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String strJ = q63.j("116", this.i);
        return (TextUtils.isEmpty(strJ) || "null".equalsIgnoreCase(strJ)) ? "" : strJ;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        Map<String, Object> map = this.i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.e;
    }

    public Map<String, Object> h() {
        return this.k;
    }

    public String i() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String strJ = q63.j("114", this.j);
        return (TextUtils.isEmpty(strJ) || "null".equalsIgnoreCase(strJ)) ? "" : strJ;
    }

    public int j() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String strJ = q63.j("172", this.j);
        if (TextUtils.isEmpty(strJ) || "null".equals(strJ)) {
            return 9377;
        }
        try {
            return Integer.parseInt(strJ);
        } catch (Exception e) {
            q0.b("LogSenderModel", e.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.g;
    }

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    public int a() {
        return this.a;
    }
}
