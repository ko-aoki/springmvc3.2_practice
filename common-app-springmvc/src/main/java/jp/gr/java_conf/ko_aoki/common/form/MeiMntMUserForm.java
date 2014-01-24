package jp.gr.java_conf.ko_aoki.common.form;

import java.io.Serializable;

public class MeiMntMUserForm  implements Serializable {

		private String userNmM;
        private String userIdM;
        private String deptNmM;
        private String deptIdM;
        private String pDeptNmM;
        private String pDeptIdM;
        private String roleIdM;
        private String roleNmM;
        private String startDateM;
        private String endDateM;

        public MeiMntMUserForm() {
		}

        public String getUserNmM() {
			return userNmM;
		}
		public void setUserNmM(String userNmM) {
			this.userNmM = userNmM;
		}
		public String getUserIdM() {
			return userIdM;
		}
		public void setUserIdM(String userIdM) {
			this.userIdM = userIdM;
		}
		public String getDeptNmM() {
			return deptNmM;
		}
		public void setDeptNmM(String deptNmM) {
			this.deptNmM = deptNmM;
		}
		public String getDeptIdM() {
			return deptIdM;
		}
		public void setDeptIdM(String deptIdM) {
			this.deptIdM = deptIdM;
		}
		public String getpDeptNmM() {
			return pDeptNmM;
		}
		public void setpDeptNmM(String pDeptNmM) {
			this.pDeptNmM = pDeptNmM;
		}
		public String getpDeptIdM() {
			return pDeptIdM;
		}
		public void setpDeptIdM(String pDeptIdM) {
			this.pDeptIdM = pDeptIdM;
		}
		public String getRoleIdM() {
			return roleIdM;
		}
		public void setRoleIdM(String roleIdM) {
			this.roleIdM = roleIdM;
		}
		public String getRoleNmM() {
			return roleNmM;
		}
		public void setRoleNmM(String roleNmM) {
			this.roleNmM = roleNmM;
		}
		public String getStartDateM() {
			return startDateM;
		}
		public void setStartDateM(String startDateM) {
			this.startDateM = startDateM;
		}
		public String getEndDateM() {
			return endDateM;
		}
		public void setEndDateM(String endDateM) {
			this.endDateM = endDateM;
		}
}
