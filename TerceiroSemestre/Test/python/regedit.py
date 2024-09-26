import winreg

def list_users():
    # Caminho do Registro onde os perfis de usuário estão listados
    key_path = r"SOFTWARE\Microsoft\Windows NT\CurrentVersion\ProfileList"

    try:
        # Abre a chave do Registro
        key = winreg.OpenKey(winreg.HKEY_LOCAL_MACHINE, key_path)
    except FileNotFoundError:
        print("A chave do Registro não foi encontrada.")
        return

    index = 0
    while True:
        try:
            # Enumera as subchaves
            subkey_name = winreg.EnumKey(key, index)
            subkey_path = f"{key_path}\\{subkey_name}"
            subkey = winreg.OpenKey(winreg.HKEY_LOCAL_MACHINE, subkey_path)
            
            try:
                # Lê o valor do ProfileImagePath
                profile_image_path, _ = winreg.QueryValueEx(subkey, "ProfileImagePath")
                user = profile_image_path.split("\\")[-1]
                print(f"Usuário encontrado: {user}")
            except FileNotFoundError:
                print(f"ProfileImagePath não encontrado para {subkey_name}")
            
            winreg.CloseKey(subkey)
            index += 1
        except OSError:
            break
    
    winreg.CloseKey(key)

if __name__ == "__main__":
    list_users()
