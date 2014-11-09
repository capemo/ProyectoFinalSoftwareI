package model;

import java.io.Serializable;

public enum Periodo implements Serializable{
	I {
		public String toString() {
			return "I";
		}
	},
	II {
		public String toString() {
			return "II";
		}
	},
	NA
}
