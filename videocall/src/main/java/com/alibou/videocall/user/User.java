//package com.alibou.videocall.user;
//
//import lombok.Builder;
//import lombok.Data;
//
//@Data
//@Builder
//public class User {
//
//    private String username;
//    private String email;
//    private String password;
//    private String status;
//    
//    private User() {}
//
//    public static Builder builder() {
//        return new Builder();
//    }
////	public String getEmail() {
////		// TODO Auto-generated method stub
////		return null;
////	}
//	public void setStatus(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public Object getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}
////	public static Object builder() {
////		// TODO Auto-generated method stub
////		return null;
////	}
//	
//	 public static class Builder {
//	        private String username;
//	        private String email;
//	        private String password;
//	        private String status;
//
//	        private Builder() {}
//
//	        public Builder username(String username) {
//	            this.username = username;
//	            return this;
//	        }
//
//	        public Builder email(String email) {
//	            this.email = email;
//	            return this;
//	        }
//
//	        public Builder password(String password) {
//	            this.password = password;
//	            return this;
//	        }
//
//	        public Builder status(String status) {
//	            this.status = status;
//	            return this;
//	        }
//
//	        public User build() {
//	            User user = new User();
//	            user.setUsername(this.username);
//	            user.setEmail(this.email);
//	            user.setPassword(this.password);
//	            user.setStatus(this.status);
//	            return user;
//	        }
//	    }
//	 
//public void setUsername(String username2) {
//	// TODO Auto-generated method stub
//	
//}
//
//public void setPassword(String password2) {
//	// TODO Auto-generated method stub
//	
//}
//
//public void setEmail(String email2) {
//	// TODO Auto-generated method stub
//	
//}
//
//private User(String username, String email, String password, String status) {
//    this.username = username;
//    this.email = email;
//    this.password = password;
//    this.status = status;
//}
//	
//}
package com.alibou.videocall.user;

public class User {

    private String username;
    private String email;
    private String password;
    private String status;

    // Private constructor to enforce the use of the builder
    private User() {}

    // Constructor used by the builder
    private User(String username, String email, String password, String status) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Static builder method
    public static Builder builder() {
        return new Builder();
    }

    // Builder class
    public static class Builder {
        private String username;
        private String email;
        private String password;
        private String status;

        private Builder() {}

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public User build() {
            return new User(username, email, password, status);
        }
    }
}
