package njutj.environment.bl.account;

import njutj.environment.blservice.account.UserBlService;
import njutj.environment.dataservice.account.UserDataService;
import njutj.environment.exception.viewexception.UserAlreadyExistentException;
import njutj.environment.vo.account.UserSaveVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBlServiceImpl implements UserBlService {
    private final UserDataService userDataService;

    @Autowired
    public UserBlServiceImpl(UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    @Override
    public void register(UserSaveVo userSaveVo) throws UserAlreadyExistentException {
        if (userDataService.isUserExistent(userSaveVo.getUsername())) {
            throw new UserAlreadyExistentException();
        }
    }
}
