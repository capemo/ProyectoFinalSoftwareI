package model;

import java.io.Serializable;

public enum Estado implements Serializable {
	VISTA {
		public String toString() {
			return "VISTA";
		}
	},
	NO_VISTA {
		public String toString() {
			return "NO VISTA";
		}
	},
	ASIGNADA {
		public String toString() {
			return "ASIGNADA";
		}
	}
}
