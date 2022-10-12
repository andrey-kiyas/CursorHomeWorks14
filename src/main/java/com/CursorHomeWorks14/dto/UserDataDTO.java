package com.CursorHomeWorks14.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.CursorHomeWorks14.model.AppUserRole;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDataDTO {
  
  private String username;
  private String email;
  private String password;
  List<AppUserRole> appUserRoles;
}
