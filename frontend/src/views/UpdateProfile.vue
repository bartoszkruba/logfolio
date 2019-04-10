<template>
  <div class="container mt-5">
    <div class="row m-auto">
      <div class="col-4">
        <b-card bg-variant="light" style="height: 100%">
          <h5 class="text-left">Profile Picture:</h5>
          <img :src="profilePicture"
               class="img-fluid mb-5" alt="profile image">
          <b-form-file
              placeholder="Choose a file..."
              drop-placeholder="Drop file here..."
              @change="uploadProfilePicture"/>
        </b-card>
      </div>
      <div class="col-8">
        <div>
          <b-card bg-variant="light">
            <h5 class="text-left">User Data:</h5>
            <b-form-group
                label-cols-sm="3"
                label="LinkedIn:"
                label-align-sm="right">
              <b-form-input :value="linkedin" @change="updateLinkedin"/>
            </b-form-group>

            <b-form-group
                label-cols-sm="3"
                label="Github:"
                label-align-sm="right"
                label-for="nested-city">
              <b-form-input :value="github" @change="updateGithub"/>
            </b-form-group>

            <b-form-group
                label-cols-sm="3"
                label="Contact Email:"
                label-align-sm="right">
              <b-form-input :value="contactEmail" @change="updateContactEmail"/>
            </b-form-group>

            <b-form-group
                label-cols-sm="3"
                label="Name:"
                label-align-sm="right">
              <b-form-input :value="name" @change="updateName"/>
            </b-form-group>

            <h5 class="text-left">Profile Description:</h5>
            <b-form-textarea rows="10" style="resize:none;"
                             :value="profileDescription" @change="updateProfileDescription"/>
          </b-card>
        </div>
      </div>
    </div>
    <div class="row mt-4 mr-auto ml-auto mb-4">
      <div class="col-12">
        <b-card bg-variant="light text-right">
          <b-button variant="primary" @click="updateProfile">Update Profile</b-button>
        </b-card>
      </div>
    </div>
  </div>


</template>

<script>
  export default {
    name: "UpdateProfile",
    data() {
      return {
        updatedName: "",
        updatedLinkedin: "",
        updatedGithub: "",
        updatedContactEmail: "",
        updatedProfileDescription: "",
        updatedProfilePicture: ""
      }
    },
    computed: {
      name() {
        // eslint-disable-next-line
        this.updatedName = this.$store.state.profile.profileName;
        return this.$store.state.profile.profileName;
      },
      linkedin() {
        // eslint-disable-next-line
        this.updatedLinkedin = this.$store.state.profile.linkedin;
        return this.$store.state.profile.linkedin;
      },
      github() {
        // eslint-disable-next-line
        this.updatedGithub = this.$store.state.profile.github;
        return this.$store.state.profile.github;
      },
      contactEmail() {
        // eslint-disable-next-line
        this.updatedContactEmail = this.$store.state.profile.contactEmail;
        return this.$store.state.profile.contactEmail;
      },
      profileDescription() {
        // eslint-disable-next-line
        this.updatedProfileDescription = this.$store.state.profile.profileDescription;
        return this.$store.state.profile.profileDescription;
      },
      profilePicture() {
        // eslint-disable-next-line
        this.updatedProfilePicture = this.$store.state.profile.profilePicture;
        return this.$store.state.profile.profilePicture;
      }
    },
    methods: {
      updateProfile() {
        this.$store.commit("setProfile", {
          profilePicture: this.updatedProfilePicture,
          profileName: this.updatedName,
          contactEmail: this.updatedContactEmail,
          github: this.updatedGithub,
          linkedin: this.updatedLinkedin,
          profileDescription: this.updatedProfileDescription,
        });
      },
      updateLinkedin(e) {
        console.log(e);
        this.updatedLinkedin = e;
      },
      updateGithub(e) {
        this.updatedGithub = e;
      },
      updateContactEmail(e) {
        this.updatedContactEmail = e;
      },
      updateName(e) {
        this.updatedName = e;
      },
      updateProfileDescription(e) {
        this.updatedProfileDescription = e;
      },
      uploadProfilePicture(e) {
        let image = e.target.files[0];
        let reader = new FileReader();
        reader.readAsDataURL(image);
        reader.onload = e => {
          this.updatedProfilePicture = e.target.result;
        }
      }
    }
  }
</script>

<style scoped>

  * {
    color: white;
  }

</style>