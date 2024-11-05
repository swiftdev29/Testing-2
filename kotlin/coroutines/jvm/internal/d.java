package kotlin.coroutines.jvm.internal;

import ge.k;
import xd.e;
import xd.g;

public abstract class d extends a {
    private final g _context;
    private transient xd.d<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(xd.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(xd.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        k.c(gVar);
        return gVar;
    }

    public final xd.d<Object> intercepted() {
        xd.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().g(e.f20356o);
            if (eVar == null || (dVar = eVar.x0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        xd.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b g10 = getContext().g(e.f20356o);
            k.c(g10);
            ((e) g10).i0(dVar);
        }
        this.intercepted = c.f18934a;
    }
}
