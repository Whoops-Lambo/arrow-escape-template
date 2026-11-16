package com.inmobi.media;

import defpackage.ar1;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4238n9 extends AbstractC4385sh {
    public final P7 d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3940ch c3940ch, EnumC4302ph enumC4302ph, InterfaceC4274oh interfaceC4274oh, fy fyVar) {
        C4182l9 c4182l9;
        P7 p7;
        if (fyVar instanceof C4182l9) {
            c4182l9 = (C4182l9) fyVar;
            int i = c4182l9.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4182l9.c = i - Integer.MIN_VALUE;
            } else {
                c4182l9 = new C4182l9(this, fyVar);
            }
        } else {
            c4182l9 = new C4182l9(this, fyVar);
        }
        Object obj = c4182l9.a;
        int i2 = c4182l9.c;
        Object obj2 = az2.a;
        Object obj3 = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                return obj2;
            }
            if (i2 == 2) {
                wz2.a0(obj);
                p7 = this.d;
                c4182l9.c = 3;
                if (p7.a(c4182l9) != obj3) {
                    return obj3;
                }
            } else {
                if (i2 != 3) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return obj2;
        }
        wz2.a0(obj);
        if (enumC4302ph == EnumC4302ph.DUPLICATE) {
            AbstractC4385sh.a(c3940ch, interfaceC4274oh);
            return obj2;
        }
        if (AbstractC4134jh.a(c3940ch)) {
            String str = c3940ch.a.b;
            c4182l9.c = 1;
            AbstractC4385sh.b(c3940ch, interfaceC4274oh);
            Object objA = this.a.a.a("pings", "id=?", new String[]{c3940ch.a.b}, c4182l9);
            if (objA != obj3) {
                objA = obj2;
            }
            if (objA != obj3) {
                objA = obj2;
            }
            if (objA != obj3) {
                return obj2;
            }
        } else {
            String str2 = c3940ch.a.b;
            c4182l9.c = 2;
            if (a(c3940ch, interfaceC4274oh, c4182l9) != obj3) {
                p7 = this.d;
                c4182l9.c = 3;
                if (p7.a(c4182l9) != obj3) {
                    return obj2;
                }
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Vg vg, fy fyVar) {
        C4126j9 c4126j9;
        if (fyVar instanceof C4126j9) {
            c4126j9 = (C4126j9) fyVar;
            int i = c4126j9.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4126j9.d = i - Integer.MIN_VALUE;
            } else {
                c4126j9 = new C4126j9(this, fyVar);
            }
        } else {
            c4126j9 = new C4126j9(this, fyVar);
        }
        Object objA = c4126j9.b;
        int i2 = c4126j9.d;
        if (i2 == 0) {
            wz2.a0(objA);
            C4161kg c4161kg = this.c;
            c4126j9.a = vg;
            c4126j9.d = 1;
            objA = c4161kg.a(vg, c4126j9);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vg = c4126j9.a;
            wz2.a0(objA);
        }
        Of of = (Of) objA;
        return new C3940ch(vg, of.c(), of.e());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd A[Catch: Error -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Error -> 0x00e3, Exception -> 0x00e7, blocks: (B:61:0x00dd, B:62:0x00e2, B:67:0x00eb, B:56:0x00ca), top: B:116:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb A[Catch: Error -> 0x00e3, Exception -> 0x00e7, TRY_LEAVE, TryCatch #9 {Error -> 0x00e3, Exception -> 0x00e7, blocks: (B:61:0x00dd, B:62:0x00e2, B:67:0x00eb, B:56:0x00ca), top: B:116:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.inmobi.media.n9, com.inmobi.media.sh] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.inmobi.media.ph, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.inmobi.media.Vg] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.inmobi.media.ph, java.lang.Object] */
    public final Object c(Vg vg, fy fyVar) {
        C4154k9 c4154k9;
        ?? r9;
        WeakReference weakReference;
        InterfaceC4274oh interfaceC4274oh;
        P7 p7;
        WeakReference weakReference2;
        InterfaceC4274oh interfaceC4274oh2;
        P7 p8;
        InterfaceC4274oh interfaceC4274oh3;
        ?? r16;
        int i;
        ?? r4;
        InterfaceC4274oh interfaceC4274oh4;
        Object objB;
        InterfaceC4274oh interfaceC4274oh5;
        ?? r2 = vg;
        if (fyVar instanceof C4154k9) {
            c4154k9 = (C4154k9) fyVar;
            int i2 = c4154k9.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4154k9.f = i2 - Integer.MIN_VALUE;
            } else {
                c4154k9 = new C4154k9(this, fyVar);
            }
        } else {
            c4154k9 = new C4154k9(this, fyVar);
        }
        Object obj = c4154k9.d;
        ?? r5 = c4154k9.f;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (r5 == 0) {
                wz2.a0(obj);
                try {
                    String str = r2.b;
                    WeakReference weakReference3 = (WeakReference) this.b.get(r2.h);
                    InterfaceC4274oh interfaceC4274oh6 = weakReference3 != null ? (InterfaceC4274oh) weakReference3.get() : null;
                    r2.l = "in_progress";
                    c4154k9.a = r2;
                    c4154k9.b = interfaceC4274oh6;
                    c4154k9.f = 1;
                    Object objA = a(r2, c4154k9);
                    if (objA != dzVar) {
                        interfaceC4274oh3 = interfaceC4274oh6;
                        r16 = r2;
                        obj = objA;
                        r2 = (EnumC4302ph) obj;
                        if (r2 == 0) {
                            i = -1;
                        } else {
                            i = AbstractC4099i9.a[r2.ordinal()];
                        }
                        if (i != 1) {
                            if (i != 2) {
                                AbstractC4385sh.a(0, "Database capacity exceeded for pings", (short) 2248, r16, System.currentTimeMillis(), interfaceC4274oh3);
                                return az2Var;
                            }
                            if (i != 3) {
                                throw new ar1();
                            }
                        }
                        r4 = r16;
                        interfaceC4274oh4 = interfaceC4274oh3;
                        c4154k9.a = r4;
                        c4154k9.b = r2;
                        c4154k9.c = interfaceC4274oh4;
                        c4154k9.f = 2;
                        objB = b(r4, c4154k9);
                        if (objB != dzVar) {
                            interfaceC4274oh5 = interfaceC4274oh4;
                            obj = objB;
                            r9 = r2;
                            r5 = r4;
                            c4154k9.a = r5;
                            c4154k9.b = r9;
                            c4154k9.c = null;
                            c4154k9.f = 3;
                            if (a((C3940ch) obj, r9, interfaceC4274oh5, c4154k9) != dzVar) {
                                return az2Var;
                            }
                        }
                    }
                } catch (Error e) {
                    e = e;
                    r5 = r2;
                    r9 = 0;
                    e.getMessage();
                    weakReference2 = (WeakReference) this.b.get(r5.h);
                    if (weakReference2 != null) {
                        interfaceC4274oh2 = (InterfaceC4274oh) weakReference2.get();
                    } else {
                        interfaceC4274oh2 = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2251, r5, System.currentTimeMillis(), interfaceC4274oh2);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p8 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 5;
                        if (p8.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                } catch (Exception e2) {
                    e = e2;
                    r5 = r2;
                    r9 = 0;
                    e.getMessage();
                    weakReference = (WeakReference) this.b.get(r5.h);
                    if (weakReference != null) {
                        interfaceC4274oh = (InterfaceC4274oh) weakReference.get();
                    } else {
                        interfaceC4274oh = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2250, r5, System.currentTimeMillis(), interfaceC4274oh);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p7 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 4;
                        if (p7.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                }
                return dzVar;
            }
            if (r5 == 1) {
                InterfaceC4274oh interfaceC4274oh7 = (InterfaceC4274oh) c4154k9.b;
                r5 = c4154k9.a;
                try {
                    wz2.a0(obj);
                    interfaceC4274oh3 = interfaceC4274oh7;
                    r16 = r5;
                    try {
                        r2 = (EnumC4302ph) obj;
                        if (r2 == 0) {
                            i = -1;
                        } else {
                            try {
                                i = AbstractC4099i9.a[r2.ordinal()];
                            } catch (Error e3) {
                                e = e3;
                                r5 = r16;
                                r9 = r2;
                                e.getMessage();
                                weakReference2 = (WeakReference) this.b.get(r5.h);
                                if (weakReference2 != null) {
                                    interfaceC4274oh2 = (InterfaceC4274oh) weakReference2.get();
                                } else {
                                    interfaceC4274oh2 = null;
                                }
                                AbstractC4385sh.a(0, e.getMessage(), (short) 2251, r5, System.currentTimeMillis(), interfaceC4274oh2);
                                if (r9 != EnumC4302ph.DUPLICATE) {
                                    p8 = this.d;
                                    c4154k9.a = null;
                                    c4154k9.b = null;
                                    c4154k9.c = null;
                                    c4154k9.f = 5;
                                    if (p8.a(c4154k9) == dzVar) {
                                        return dzVar;
                                    }
                                }
                                return az2Var;
                            } catch (Exception e4) {
                                e = e4;
                                r5 = r16;
                                r9 = r2;
                                e.getMessage();
                                weakReference = (WeakReference) this.b.get(r5.h);
                                if (weakReference != null) {
                                    interfaceC4274oh = (InterfaceC4274oh) weakReference.get();
                                } else {
                                    interfaceC4274oh = null;
                                }
                                AbstractC4385sh.a(0, e.getMessage(), (short) 2250, r5, System.currentTimeMillis(), interfaceC4274oh);
                                if (r9 != EnumC4302ph.DUPLICATE) {
                                    p7 = this.d;
                                    c4154k9.a = null;
                                    c4154k9.b = null;
                                    c4154k9.c = null;
                                    c4154k9.f = 4;
                                    if (p7.a(c4154k9) == dzVar) {
                                        return dzVar;
                                    }
                                }
                                return az2Var;
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                AbstractC4385sh.a(0, "Database capacity exceeded for pings", (short) 2248, r16, System.currentTimeMillis(), interfaceC4274oh3);
                                return az2Var;
                            }
                            if (i != 3) {
                                throw new ar1();
                            }
                        }
                        r4 = r16;
                        interfaceC4274oh4 = interfaceC4274oh3;
                        c4154k9.a = r4;
                        c4154k9.b = r2;
                        c4154k9.c = interfaceC4274oh4;
                        c4154k9.f = 2;
                        objB = b(r4, c4154k9);
                        if (objB != dzVar) {
                            interfaceC4274oh5 = interfaceC4274oh4;
                            obj = objB;
                            r9 = r2;
                            r5 = r4;
                            c4154k9.a = r5;
                            c4154k9.b = r9;
                            c4154k9.c = null;
                            c4154k9.f = 3;
                            if (a((C3940ch) obj, r9, interfaceC4274oh5, c4154k9) != dzVar) {
                            }
                        }
                    } catch (Error e5) {
                        e = e5;
                        r5 = r16;
                        r2 = 0;
                    } catch (Exception e6) {
                        e = e6;
                        r5 = r16;
                        r2 = 0;
                    }
                } catch (Error e7) {
                    e = e7;
                    r9 = 0;
                    e.getMessage();
                    weakReference2 = (WeakReference) this.b.get(r5.h);
                    if (weakReference2 != null) {
                        interfaceC4274oh2 = (InterfaceC4274oh) weakReference2.get();
                    } else {
                        interfaceC4274oh2 = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2251, r5, System.currentTimeMillis(), interfaceC4274oh2);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p8 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 5;
                        if (p8.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                } catch (Exception e8) {
                    e = e8;
                    r9 = 0;
                    e.getMessage();
                    weakReference = (WeakReference) this.b.get(r5.h);
                    if (weakReference != null) {
                        interfaceC4274oh = (InterfaceC4274oh) weakReference.get();
                    } else {
                        interfaceC4274oh = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2250, r5, System.currentTimeMillis(), interfaceC4274oh);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p7 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 4;
                        if (p7.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                }
                return dzVar;
            }
            if (r5 == 2) {
                interfaceC4274oh5 = c4154k9.c;
                EnumC4302ph enumC4302ph = (EnumC4302ph) c4154k9.b;
                Vg vg2 = c4154k9.a;
                try {
                    wz2.a0(obj);
                    r9 = enumC4302ph;
                    r5 = vg2;
                    try {
                        c4154k9.a = r5;
                        c4154k9.b = r9;
                        c4154k9.c = null;
                        c4154k9.f = 3;
                        if (a((C3940ch) obj, r9, interfaceC4274oh5, c4154k9) != dzVar) {
                            return dzVar;
                        }
                    } catch (Error e9) {
                        e = e9;
                        e.getMessage();
                        weakReference2 = (WeakReference) this.b.get(r5.h);
                        if (weakReference2 != null) {
                            interfaceC4274oh2 = (InterfaceC4274oh) weakReference2.get();
                        } else {
                            interfaceC4274oh2 = null;
                        }
                        AbstractC4385sh.a(0, e.getMessage(), (short) 2251, r5, System.currentTimeMillis(), interfaceC4274oh2);
                        if (r9 != EnumC4302ph.DUPLICATE) {
                            p8 = this.d;
                            c4154k9.a = null;
                            c4154k9.b = null;
                            c4154k9.c = null;
                            c4154k9.f = 5;
                            if (p8.a(c4154k9) == dzVar) {
                                return dzVar;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        e.getMessage();
                        weakReference = (WeakReference) this.b.get(r5.h);
                        if (weakReference != null) {
                            interfaceC4274oh = (InterfaceC4274oh) weakReference.get();
                        } else {
                            interfaceC4274oh = null;
                        }
                        AbstractC4385sh.a(0, e.getMessage(), (short) 2250, r5, System.currentTimeMillis(), interfaceC4274oh);
                        if (r9 != EnumC4302ph.DUPLICATE) {
                            p7 = this.d;
                            c4154k9.a = null;
                            c4154k9.b = null;
                            c4154k9.c = null;
                            c4154k9.f = 4;
                            if (p7.a(c4154k9) == dzVar) {
                                return dzVar;
                            }
                        }
                    }
                } catch (Error e11) {
                    e = e11;
                    r9 = enumC4302ph;
                    r5 = vg2;
                    e.getMessage();
                    weakReference2 = (WeakReference) this.b.get(r5.h);
                    if (weakReference2 != null) {
                        interfaceC4274oh2 = (InterfaceC4274oh) weakReference2.get();
                    } else {
                        interfaceC4274oh2 = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2251, r5, System.currentTimeMillis(), interfaceC4274oh2);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p8 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 5;
                        if (p8.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                } catch (Exception e12) {
                    e = e12;
                    r9 = enumC4302ph;
                    r5 = vg2;
                    e.getMessage();
                    weakReference = (WeakReference) this.b.get(r5.h);
                    if (weakReference != null) {
                        interfaceC4274oh = (InterfaceC4274oh) weakReference.get();
                    } else {
                        interfaceC4274oh = null;
                    }
                    AbstractC4385sh.a(0, e.getMessage(), (short) 2250, r5, System.currentTimeMillis(), interfaceC4274oh);
                    if (r9 != EnumC4302ph.DUPLICATE) {
                        p7 = this.d;
                        c4154k9.a = null;
                        c4154k9.b = null;
                        c4154k9.c = null;
                        c4154k9.f = 4;
                        if (p7.a(c4154k9) == dzVar) {
                            return dzVar;
                        }
                    }
                    return az2Var;
                }
            } else if (r5 == 3) {
                Vg vg3 = c4154k9.a;
                wz2.a0(obj);
            } else {
                if (r5 != 4 && r5 != 5) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2Var;
        } catch (Error e13) {
            e = e13;
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4238n9(Gh gh) {
        super(gh);
        gh.getClass();
        this.d = new P7(gh, new C4210m9(this), this.c);
    }
}
