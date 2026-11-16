package com.bytedance.sdk.component.noq.ahm.rz;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.noq.gm;
import com.bytedance.sdk.component.noq.sx;
import com.bytedance.sdk.component.noq.twf;
import com.bytedance.sdk.component.noq.um;
import com.bytedance.sdk.component.noq.xh;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq {
    private final twf ahm;
    private ExecutorService fi;
    private Context gf;
    private com.bytedance.sdk.component.noq.uq noq;
    private volatile xh rz;
    private volatile um uq;
    private ExecutorService yo;
    private Map<String, List<rz>> kgy = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.noq.rz> ct = new ConcurrentHashMap();

    private ExecutorService nu() {
        ExecutorService executorServiceKgy = this.ahm.kgy();
        return executorServiceKgy != null ? executorServiceKgy : com.bytedance.sdk.component.noq.ahm.kgy.ahm.kgy();
    }

    private com.bytedance.sdk.component.noq.uq ra() {
        com.bytedance.sdk.component.noq.uq uqVarRz = this.ahm.rz();
        return uqVarRz == null ? new com.bytedance.sdk.component.noq.kgy.kgy() : uqVarRz;
    }

    private com.bytedance.sdk.component.noq.rz uq(com.bytedance.sdk.component.noq.ahm ahmVar) {
        com.bytedance.sdk.component.noq.rz rzVarUq = this.ahm.uq();
        return rzVarUq != null ? rzVarUq : new com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy.ahm(ahmVar.fi(), ahmVar.kgy());
    }

    public um ahm(com.bytedance.sdk.component.noq.ahm ahmVar) {
        if (ahmVar == null) {
            ahmVar = com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.gf();
        }
        if (this.uq == null) {
            synchronized (com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.ahm.class) {
                try {
                    if (this.uq == null) {
                        this.uq = new com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.ahm(ahmVar.ahm(), ahmVar.uq());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.uq;
    }

    public com.bytedance.sdk.component.noq.uq ct() {
        if (this.noq == null) {
            this.noq = ra();
        }
        return this.noq;
    }

    public ExecutorService fi() {
        ExecutorService executorServiceAhm;
        sx sxVarAhm = this.ahm.ahm();
        if (sxVarAhm != null && (executorServiceAhm = sxVarAhm.ahm()) != null) {
            return executorServiceAhm;
        }
        if (this.fi == null) {
            this.fi = com.bytedance.sdk.component.noq.ahm.kgy.ahm.kgy();
        }
        return this.fi;
    }

    public Map<String, List<rz>> gf() {
        return this.kgy;
    }

    public xh kgy(com.bytedance.sdk.component.noq.ahm ahmVar) {
        if (ahmVar == null) {
            ahmVar = com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.gf();
        }
        if (this.rz == null) {
            synchronized (com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.rz.class) {
                try {
                    if (this.rz == null) {
                        this.rz = new com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.rz(new com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.kgy(ahmVar.ahm(), ahmVar.rz()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.rz;
    }

    public ExecutorService noq() {
        ExecutorService executorServiceKgy;
        sx sxVarAhm = this.ahm.ahm();
        if (sxVarAhm != null && (executorServiceKgy = sxVarAhm.kgy()) != null) {
            return executorServiceKgy;
        }
        if (this.yo == null) {
            this.yo = nu();
        }
        return this.yo;
    }

    public com.bytedance.sdk.component.noq.rz rz(com.bytedance.sdk.component.noq.ahm ahmVar) {
        if (ahmVar == null) {
            ahmVar = com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.gf();
        }
        String string = ahmVar.fi().toString();
        com.bytedance.sdk.component.noq.rz rzVar = this.ct.get(string);
        if (rzVar != null) {
            return rzVar;
        }
        com.bytedance.sdk.component.noq.rz rzVarUq = uq(ahmVar);
        this.ct.put(string, rzVarUq);
        return rzVarUq;
    }

    public gm yo() {
        twf twfVar = this.ahm;
        if (twfVar != null) {
            return twfVar.noq();
        }
        return null;
    }

    public noq(Context context, twf twfVar) {
        this.ahm = (twf) yo.kgy(twfVar);
        this.gf = context;
        com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.kgy(context, twfVar.ct());
    }

    public Collection<com.bytedance.sdk.component.noq.rz> uq() {
        return this.ct.values();
    }

    public um rz() {
        return this.uq;
    }

    public boolean ahm() {
        return this.ahm.yo();
    }

    public Context kgy() {
        return this.gf;
    }

    public com.bytedance.sdk.component.noq.rz kgy(String str) {
        return rz(com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.kgy(new File(str)));
    }

    public com.bytedance.sdk.component.noq.ahm.rz.ahm.ahm kgy(rz rzVar) {
        ImageView.ScaleType scaleTypeGf = rzVar.gf();
        if (scaleTypeGf == null) {
            scaleTypeGf = com.bytedance.sdk.component.noq.ahm.rz.ahm.ahm.kgy;
        }
        ImageView.ScaleType scaleType = scaleTypeGf;
        Bitmap.Config configRa = rzVar.ra();
        if (configRa == null) {
            configRa = com.bytedance.sdk.component.noq.ahm.rz.ahm.ahm.ahm;
        }
        return new com.bytedance.sdk.component.noq.ahm.rz.ahm.ahm(rzVar.ahm(), rzVar.rz(), scaleType, configRa, rzVar.uq(), rzVar.ct());
    }
}
